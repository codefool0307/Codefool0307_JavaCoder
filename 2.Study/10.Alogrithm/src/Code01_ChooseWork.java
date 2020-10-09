package class04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Code01_ChooseWork {

	public static class Job {
		public int money;
		public int hard;

		public Job(int money, int hard) {
			this.money = money;
			this.hard = hard;
		}
	}

	public static class JobComparator implements Comparator<Job> {
		@Override
		public int compare(Job o1, Job o2) {
			return o1.hard != o2.hard ? (o1.hard - o2.hard) : (o2.money - o1.money);
		}
	}

	public static int[] getMoneys(Job[] job, int[] ability) {
		Arrays.sort(job, new JobComparator());
		// 难度为key的工作，最优钱数是多少，有序表
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(job[0].hard, job[0].money);
		Job pre = job[0]; // pre 之前组的组长
		for (int i = 1; i < job.length; i++) {
			if (job[i].hard != pre.hard && job[i].money > pre.money) {
				pre = job[i];
				map.put(pre.hard, pre.money);
			}
		}
		int[] ans = new int[ability.length];
		for (int i = 0; i < ability.length; i++) {
			Integer key = map.floorKey(ability[i]);
			ans[i] = key != null ? map.get(key) : 0;
		}
		return ans;
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(7, "我是7");
		map.put(3, "我是3");
		map.put(9, "我是9");
		map.put(2, "我是2");
		map.put(8, "我是8");
		map.put(5, "我是5");
		System.out.println(map.containsKey(2));
		System.out.println(map.get(7));
		map.remove(9);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		// <= num 离num最近的东西
		System.out.println(map.floorKey(6));
		// >= num 离num最近的东西
		System.out.println(map.ceilingKey(6));
		
		// 时间复杂度全是O(logN)级别
		
	}

}
