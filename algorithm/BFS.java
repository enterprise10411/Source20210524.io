package algorithm;

public class BFS {
//	private static List<List<Integer>> bfsWithBinaryTreeLevelOrderTraversal(Node root) {
//		if (root == null) {
//			// ���ڵ�Ϊ�գ�˵�������������ڣ�ֱ�ӷ��ؿ�����
//			return Arrays.asList();
//		}
//
//		// ���յĲ���������
//		List<List<Integer>> result = new ArrayList<>();
//
//		Queue<Node> queue = new LinkedList<>();
//		queue.offer(root);
//
//		while (!queue.isEmpty()) {
//			// ��¼ÿһ��
//			List<Integer> level = new ArrayList<>();
//			int levelNum = queue.size();
//			// ������ǰ��Ľڵ�
//			for (int i = 0; i < levelNum; i++) {
//				Node node = queue.poll();
//				// ���׽ڵ�������ӽڵ����,���� levelNum �������ǰ��ģ�������ӵ����ҽڵ㲢�����ڵ�ǰ�㱻������
//				if (node.left != null) {
//					queue.add(node.left);
//				}
//				if (node.right != null) {
//					queue.add(node.right);
//				}
//				level.add(node.value);
//			}
//			result.add(level);
//		}
//
//		return result;
//	}
}
