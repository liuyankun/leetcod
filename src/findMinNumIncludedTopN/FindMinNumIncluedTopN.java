package findMinNumIncludedTopN;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * �Ӻ��������в��ҳ�ǰk�����ֵ����ȷʱ�临�Ӷ�Ϊ��k + (n - k) * lgk,�ռ临�Ӷ�Ϊ O��k��,ĿǰΪ�����㷨�������㷨
 * 
 * @author TongXueQiang
 * @date 2016/03/08
 * @since JDK 1.8
 */
public class FindMinNumIncluedTopN {
 /**
  * �Ӻ��������в��ҳ�ǰk�����ֵ
  * 
  * @param k
  * @return
  * @throws IOException
  */
 public int[] findMinNumIncluedTopN(int k) throws IOException {
  Long start = System.nanoTime();
  
  int[] array = new int[k];
  int index = 0;
  // ���ļ����뺣������
  BufferedReader reader = new BufferedReader(new FileReader(new File("F:/number.txt")));
  String text = null;
  // �ȶ���ǰn������,������
  do {
   text = reader.readLine();
   if (text != null) {
    array[index++] = Integer.parseInt(text);
   }   
  } while (text != null && index <= k - 1);
  
  MinHeap heap = new MinHeap(array);//��ʼ����
  for (int i : heap.heap) {
   System.out.print(i + " ");
  }
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  System.out.print("-------------------------------------------------------------");
  heap.BuildMinHeap();//����С����
  System.out.println();
  System.out.println("����С����֮��:");
  for (int i : heap.heap) {
   System.out.print(i + " ");
  }
  System.out.println();
  // �����ļ���ʣ���n���ļ���������������Ϊ���޴�-k�����ݣ�������������ݱ�heap[0]�󣬾��滻֮��ͬʱ���¶�
  while (text != null) {
   text = reader.readLine();
   if (text != null && !"".equals(text.trim())) {
    if (Integer.parseInt(text) > heap.heap[0]) {
     heap.heap[0] = Integer.parseInt(text);
     heap.Minify(0);//����С����
    }
   }
  }
  //���Զѽ�������(Ĭ�Ͻ���)
  heap.HeapSort();
  
  Long end = System.nanoTime();
  double time = (end - start) / Math.pow(10,9);
  System.out.println("��ʱ��"+ time + "��");
  for (int i : heap.heap) {
   System.out.println(i);
  }
  return heap.heap;
 }
}