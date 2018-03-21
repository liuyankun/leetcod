package findMinNumIncludedTopN;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 从海量数据中查找出前k个最大值，精确时间复杂度为：k + (n - k) * lgk,空间复杂度为 O（k）,目前为所有算法中最优算法
 * 
 * @author TongXueQiang
 * @date 2016/03/08
 * @since JDK 1.8
 */
public class FindMinNumIncluedTopN {
 /**
  * 从海量数据中查找出前k个最大值
  * 
  * @param k
  * @return
  * @throws IOException
  */
 public int[] findMinNumIncluedTopN(int k) throws IOException {
  Long start = System.nanoTime();
  
  int[] array = new int[k];
  int index = 0;
  // 从文件导入海量数据
  BufferedReader reader = new BufferedReader(new FileReader(new File("F:/number.txt")));
  String text = null;
  // 先读出前n条数据,构建堆
  do {
   text = reader.readLine();
   if (text != null) {
    array[index++] = Integer.parseInt(text);
   }   
  } while (text != null && index <= k - 1);
  
  MinHeap heap = new MinHeap(array);//初始化堆
  for (int i : heap.heap) {
   System.out.print(i + " ");
  }
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  heap.BuildMinHeap();//构建小顶堆
  System.out.println();
  System.out.println("构建小顶堆之后:");
  for (int i : heap.heap) {
   System.out.print(i + " ");
  }
  System.out.println();
  // 遍历文件中剩余的n（文件数据容量，假设为无限大）-k条数据，如果读到的数据比heap[0]大，就替换之，同时更新堆
  while (text != null) {
   text = reader.readLine();
   if (text != null && !"".equals(text.trim())) {
    if (Integer.parseInt(text) > heap.heap[0]) {
     heap.heap[0] = Integer.parseInt(text);
     heap.Minify(0);//调整小顶堆
    }
   }
  }
  //最后对堆进行排序(默认降序)
  heap.HeapSort();
  
  Long end = System.nanoTime();
  double time = (end - start) / Math.pow(10,9);
  System.out.println("用时："+ time + "秒");
  for (int i : heap.heap) {
   System.out.println(i);
  }
  return heap.heap;
 }
}