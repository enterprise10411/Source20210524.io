package algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class lock{
	String surnode[],curno,lasno;
	int step,dis,ii;//steps, distance

	private int ds(String []deadends,String target) {

		
		while (!target.equals(curno)) {
			calsurnode(curno+"");
			caldis(curno+"");// operations on distance
			moveon();
			checp();
		}
	
		// test this point, reach wrong point,go back and move in different directions



		//calculate current node's surrnodes
		

		return step;
	}

	private void checp() {

//		for (int j = 0; j < deadends.length; j++) {
//			//			 head back
//			if (deadends[j].equals(curno+"")) {
//				curno=lasno; step--;
//			}
//			
//		}
		
	}

	private int caldis(String curdes) {
		// TODO Auto-generated method stub
		for (int i = 0; i <  curdes.length(); i++) {
			dis+=Character.getNumericValue(curdes.charAt(i));
		}

		// get dis curno and destination
		//		for (int i = 0; i < target.length(); i++) {
		//			dis+=Character.getNumericValue(target.charAt(i));
		//			
		//			
		//		}
		return dis;
	}//caldis


	private void calsurnode(String curdes) {
		surnode=new String[8];// int is a class?
		for (int i = 0; i <  curdes.length()-1; i++) {
			int g= Character.getNumericValue( curdes.charAt(i) );
			surnode[i]=( g+1+"" )  +curdes.substring(i+1, curdes.length());
			surnode[i+1]=( g-1+"" )  +curdes.substring(i+1, curdes.length());
		}
	}//calsurnode
	
	
	
		private void moveon() {
			curno=surnode[ii];

		}

		/*	
public int openLock(String[] deadends, String target) {
2 Set<String> set = new HashSet<>(Arrays.asList(deadends));
3 //��ʼ�������ַ�����"0000"���൱�ڸ��ڵ�
4 String startStr = "0000";
5 if (set.contains(startStr))
6 return -1;
7 //��������
8 Queue<String> queue = new LinkedList<>();
9 //��¼���ʹ��Ľڵ�
10 Set<String> visited = new HashSet<>();
11 queue.offer(startStr);
12 visited.add(startStr);
13 //���Ĳ���
14 int level = 0;
15 while (!queue.isEmpty()) {
16 //ÿ����ӽڵ����
17 int size = queue.size();
18 while (size-- > 0) {
19 //ÿ���ڵ��ֵ
20 String str = queue.poll();
21 //����ÿ���ڵ��е�4�����ֱַ���м�1�ͼ�1���൱�ڴ���8���ӽڵ㣬��˸��ӽڵ�
22 //������ȶ������������ӽڵ�
23 for (int i = 0; i < 4; i++) {
24 char ch = str.charAt(i);
25 //strAdd��ʾ��1�Ľ����strSub��ʾ��1�Ľ��
26 String strAdd = str.substring(0, i) + (ch == '9' ? 0 : ch - '0' + 1) + str.substring(i + 1);
27 String strSub = str.substring(0, i) + (ch == '0' ? 9 : ch - '0' - 1) + str.substring(i + 1);
28 //����ҵ�ֱ�ӷ���
29 if (str.equals(target))
30 return level;
31 //���ܰ�����������Ҳ���ܰ������ʹ����ַ���
32 if (!visited.contains(strAdd) && !set.contains(strAdd)) {
33 queue.offer(strAdd);
34 visited.add(strAdd);
35 }
36 if (!visited.contains(strSub) && !set.contains(strSub)) {
37 queue.offer(strSub);
38 visited.add(strSub);
39 }
40 }
41 }
42 //��ǰ��������ˣ�����һ�㣬����Ҫ��1
43 level++;
44 }
45 return -1;
46 }			
			
		
		*/
		
		public int openLock(String[] deadends, String target) {
			Set<String> set = new HashSet<>(Arrays.asList(deadends));
			//��ʼ�������ַ�����"0000"���൱�ڸ��ڵ�
			String startStr = "0000";
			if (set.contains(startStr))
				 return -1;
			//��������
			Queue<String> queue = new LinkedList<>();//����ʵ�� BFS
			//��¼���ʹ��Ľڵ�
			Set<String> visited = new HashSet<>();
			queue.offer(startStr);
			visited.add(startStr);
			//���Ĳ���
			int level = 0;
			while (!queue.isEmpty()) {
				//ÿ����ӽڵ����
				int size = queue.size();
				while (size-- > 0) {
					//ÿ���ڵ��ֵ
					String str = queue.poll();
					//����ÿ���ڵ��е�4�����ֱַ���м�1�ͼ�1���൱�ڴ���8���ӽڵ㣬��˸��ӽڵ�
					//������ȶ������������ӽڵ�
					for (int i = 0; i < 4; i++) {
						char ch = str.charAt(i);
						//strAdd��ʾ��1�Ľ����strSub��ʾ��1�Ľ��
						String strAdd = str.substring(0, i) + (ch == '9' ? 0 : ch - '0' + 1) + str.substring(i + 1);
						String strSub = str.substring(0, i) + (ch == '0' ? 9 : ch - '0' - 1) + str.substring(i + 1);
						//����ҵ�ֱ�ӷ���
						if (str.equals(target))
							30 return level;
						//���ܰ�����������Ҳ���ܰ������ʹ����ַ���
						if (!visited.contains(strAdd) && !set.contains(strAdd)) {
							queue.offer(strAdd);
							visited.add(strAdd);
						}
						if (!visited.contains(strSub) && !set.contains(strSub)) {
							queue.offer(strSub);
							visited.add(strSub);
						}
					}
				}
				//��ǰ��������ˣ�����һ�㣬����Ҫ��1
				level++;
			}
			return -1;
		}

		
		
	public static void main(String[] args) {
		lock t1=new lock();

		System.out.println(	t1.caldis("1563"));
	}
}
