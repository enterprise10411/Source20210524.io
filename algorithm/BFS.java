package algorithm;

public class BFS {
//	private static List<List<Integer>> bfsWithBinaryTreeLevelOrderTraversal(Node root) {
//		if (root == null) {
//			// 根节点为空，说明二叉树不存在，直接返回空数组
//			return Arrays.asList();
//		}
//
//		// 最终的层序遍历结果
//		List<List<Integer>> result = new ArrayList<>();
//
//		Queue<Node> queue = new LinkedList<>();
//		queue.offer(root);
//
//		while (!queue.isEmpty()) {
//			// 记录每一层
//			List<Integer> level = new ArrayList<>();
//			int levelNum = queue.size();
//			// 遍历当前层的节点
//			for (int i = 0; i < levelNum; i++) {
//				Node node = queue.poll();
//				// 队首节点的左右子节点入队,由于 levelNum 是在入队前算的，所以入队的左右节点并不会在当前层被遍历到
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
