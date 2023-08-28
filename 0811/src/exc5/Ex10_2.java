package exc5;

public class Ex10_2 {

	public static void main(String[] args) {
		//3m 짜리 우물 바닥에 달팽이가 있다
		//달팽이는 낮동안 55cm 올라올 수 있다 하지만 
		//날이 지면 잠을 자야한다 자는 동안 3cm 를 미끄러져 내려온다
		// 달팽이가 우물 밖으로 나오는데 며칠이 걸릴까
//		int[] height = new int[6];
//		for(int i=0; i<height.length; i++) {
//			height[i] = 55+52*i;
//			if(height[i]>=300) {
//				System.out.println(i+1);
//				break;
			
			int depth = 3*100, height = 0;
			final int up = 55;
			final int down = 3;
			int days=1;
			
			while(true) {
				height+=up;
				if(height>=depth)break;
				days++;
				height-=down;
				
			}
			System.out.println(days);
			
			}
	
	//	}
	//	}
	
	}


