package dan.programmers.solution.level1;

/*
 * Date : 2019-12-22
 * Auth : Oh Dong-geon
 * Description : ���ڿ� �迭���� n�� �ش��ϴ� index�� ���ڿ� �迭�� �����Ѵ�.
 *               ���� ���� ��� ���������� ����.
 */

class SortStrings {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for(int i = 0; i < strings.length; i++) {
            for(int j = i + 1; j < strings.length; j++) {
                if(strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }

                if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }

        return strings;
    }
}