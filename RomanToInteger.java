    public int romanToInt(String s) {
             HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < c.length; i++) {
            int first = map.get(c[i]);
            if (i == c.length - 1) {
                sum += first;
            } else {
                int second = map.get(c[i + 1]);
                if (first >= second) {
                    sum += first;
                } else {
                    sum = sum + (second - first);
                    i++;
                }
            }
            }
        return sum;
    }
