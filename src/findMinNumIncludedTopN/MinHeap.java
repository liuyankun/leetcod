package findMinNumIncludedTopN;
/**
 * С����
 * @author TongXueQiang
 * @date 2016/03/09
 * @since JDK 1.8
 */
public class MinHeap {
 int[] heap;
 int heapsize;

 public MinHeap(int[] array) {
  this.heap = array;
  this.heapsize = heap.length;
 }
 
 /**
  * ����С����
  */
 public void BuildMinHeap() {
  for (int i = heapsize / 2 - 1; i >= 0; i--) {
   Minify(i);// �������Ͻ���ǰ�������ѻ�
  }
 }
 /**
  * �Է�Ҷ�ڵ����
  * @param i
  */
 public void Minify(int i) {
  int l = 2*i + 1;
  int r = 2*i + 2;
  int min;

  if (l < heapsize && heap[l] < heap[i])
   min = l;
  else
   min = i;
  if (r < heapsize && heap[r] < heap[min])
   min = r;
  if (min == i || min >= heapsize)// ���largest����i˵��i�����Ԫ��
            // largest����heap��Χ˵�������ڱ�i�ڵ�����Ů
   return;
  swap(heap,i,min);
  Minify(min); 
 }
 private void swap(int[] heap, int i, int min) {
  int tmp = heap[i];// ����i��largest��Ӧ��Ԫ��λ�ã���largestλ�õݹ����maxify
  heap[i] = heap[min];
  heap[min] = tmp;  
 } 
 /**
  * ������
  */
 public void HeapSort() {
  for (int i = 0; i < heap.length; i++) {
   // ִ��n�Σ���ÿ����ǰ����ֵ�ŵ���ĩβ
   swap(heap,0,heapsize-1);   
   heapsize--;
   Minify(0);
  }
 }
 
 



 public void IncreaseValue(int i, int val) {
  heap[i] = val;
  if (i >= heapsize || i <= 0 || heap[i] >= val)
   return;
  int p = Parent(i);
  if (heap[p] >= val)
   return;
  heap[i] = heap[p];
  IncreaseValue(p, val);
 }

 private int Parent(int i) {
  return (i - 1) / 2;
 }
}

 

