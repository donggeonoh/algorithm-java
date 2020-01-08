package dan.programmers.solution.hash;

import java.util.*;

/*
 * Date : 2019-12-26
 * Auth : Oh Dong-geon
 * Description : 프로그래머스 베스트 앨범 문제 솔루션입니다.
 */

public class BestAlbum {
    public static void main(String[] args) {
        String[] input1 = {
                "classic", "pop", "classic", "classic", "pop"
        };
        int[] input2 = {
                500, 600, 150, 800, 2500
        };
        new BestAlbumSolution().solution(input1, input2);
    }
}

class BestAlbumSolution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer, String> g = new HashMap<>();
        HashMap<Integer, Integer> p = new HashMap<>();
        HashMap<Integer, String> cp = new HashMap<>();
        int genreLength = genres.length;
        int size = 0;
        int[] answer;

        for(int i = 0; i < genreLength; i++){
            p.put(i, plays[i]);
            g.put(i, genres[i]);
        }

        HashSet<String> gs = new HashSet<>(Arrays.asList(genres).subList(0, genreLength));
        size = g.size();

        for(String str : gs){
            int count = 0;
            for(int i = 0; i < size; i++){
                if(g.get(i).equals(str)){
                    count += p.get(i);
                }
            }
            cp.put(count, str);
        }

        TreeMap sortTree = new TreeMap(cp);
        String[] sortGenre = new String[gs.size()];
        int index = 0;

        for(Object o : sortTree.keySet()){
            sortGenre[index] = sortTree.get(o).toString();
            index++;
        }

        ArrayList<Integer> fIndex = new ArrayList<>();
        for(int i = sortGenre.length - 1; i >= 0; i--){
            int count = 0;
            for(int num : g.keySet()){
                if(sortGenre[i].equals(g.get(num))){
                    count++;
                }
            }

            int[] temp = new int[count];
            int k = 0;
            for(int num : g.keySet()){
                if(sortGenre[i].equals(g.get(num))){
                    temp[k] = p.get(num);
                    k++;
                }
            }

            if(temp.length != 1){
                Arrays.sort(temp);
                for(int j = temp.length - 1; j >= temp.length - 2; j--){
                    for(int num : p.keySet()){
                        if(temp[j] == p.get(num)){
                            fIndex.add(num);
                            p.put(num, 0);
                            break;
                        }
                    }
                }
            }
            else {
                for(int num : p.keySet()){
                    if(temp[0] == p.get(num)){
                        fIndex.add(num);
                        p.put(num, 0);

                        break;
                    }
                }
            }
        }

        answer = new int[fIndex.size()];

        for(int i = 0; i < fIndex.size(); i++){
            answer[i] = fIndex.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }
}
