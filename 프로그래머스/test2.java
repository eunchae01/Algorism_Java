package 프로그래머스;

public class test2 {
	public static void main(String[] args) {
		System.out.println(solution("23four5six7"));
	}

	public static int solution(String s){
		String str = "";
		
		int index = 0;
		
		for (int i = 0; i < s.length(); i = index) {
			if (Character.isDigit(s.charAt(i))){
				str += s.charAt(i);
				index++;
			}else {
				if (s.charAt(i) == 'z'){
					str += '0';
					index += 4;
				} else if (s.charAt(i) == 'o') {
					str += '1';
					index += 3;
				} else if (s.charAt(i) == 't') {
					if (s.charAt(i + 1) == 'w'){
						str += '2';
						index += 3;
					}else {
						str += '3';
						index += 5;
					}
				} else if (s.charAt(i) == 'f') {
					if (s.charAt(i + 1) == 'o'){
						str += '4';
					}else {
						str += '5';
					}
					index += 4;
				} else if (s.charAt(i) == 's') {
					if (s.charAt(i + 1) == 'i'){
						str += '6';
						index += 3;
					}else {
						str += '7';
						index += 5;
					}
				} else if (s.charAt(i) == 'e') {
					str += '8';
					index += 5;
				} else {
					str += '9';
					index += 4;
				}
			}
		}
		
		return Integer.parseInt(str);
	}
}


