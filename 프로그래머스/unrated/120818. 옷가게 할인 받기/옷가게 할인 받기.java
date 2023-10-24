class Solution {
    public int solution(int price) {
        double answer = price;
		
		if(price >= 500000){
			answer = (double)price * 0.8;
		}else if(price >= 300000){
			answer = (double)price * 0.90;
		}else if(price >= 100000){
			answer = (double)price * 0.95;
		}

		return (int)answer;
    }
}