import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(today, ".");

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            st = new StringTokenizer(terms[i], " ");

            map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < privacies.length; i++) {
            st = new StringTokenizer(privacies[i], ". ");

            int befoYear = Integer.parseInt(st.nextToken());
            int befoMonth = Integer.parseInt(st.nextToken());
            int befoDay = Integer.parseInt(st.nextToken());

            String befoTerm = st.nextToken();

            if (befoDay == 1){  // 수집 일자가 1일일 경우
                befoDay = 28;

                befoMonth += map.get(befoTerm) % 12 - 1;

            }else {         // 수집 일자가 1일이 아닐 경우
                befoDay--;

                befoMonth += map.get(befoTerm) % 12;
            }

            befoYear += map.get(befoTerm) / 12;

            if (befoMonth > 12){
                befoMonth -= 12;
                befoYear++;
            }
            
            if (befoYear < year){
                //System.out.println("1");
                answer.add(i + 1);
            }else if(befoYear == year){
                if (befoMonth < month){
                    //System.out.println("2");
                    answer.add(i + 1);
                }else if (befoMonth == month){
                    if (befoDay < day){
                        //System.out.println("3");
                        answer.add(i + 1);
                    }
                }
            }
        }

        //System.out.println(answer);

        return answer;
    }
}