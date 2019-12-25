package dan.programmers.solution.hash;

import java.util.ArrayList;
import java.util.HashMap;

class Camouflage {

    public static void main(String[] args) {
        CamouflageSolution solution = new CamouflageSolution();
        String[][] input = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution.solution(input);
    }
}

class CamouflageSolution {
    public int solution(String[][] clothes) {
        HashMap<String, ArrayList<String>> h = new HashMap<>();
        ArrayList<String> typeList = new ArrayList<>();
        int answer = 0;

        for (String[] cloth : clothes) {
            int innerLength = cloth.length;
            String type = cloth[innerLength - 1];

            for (int j = 0; j < innerLength - 1; j++) {
                if (h.get(type) == null) {
                    ArrayList<String> clothList = new ArrayList<>();
                    clothList.add(cloth[j]);
                    typeList.add(type);

                    h.put(type, clothList);
                    continue;
                }
                ArrayList<String> clothList = h.get(type);
                clothList.add(cloth[j]);
                h.put(type, clothList);
            }
        }

        for(int i = 0; i < typeList.size(); i++) {
            answer += h.get(typeList.get(i)).size();
            for(int j = i + 1; j < typeList.size(); j++) {
                int temp = h.get(typeList.get(i)).size() * h.get(typeList.get(j)).size();
                answer += temp;
            }
        }

        System.out.println(answer);

        return answer;
    }
}