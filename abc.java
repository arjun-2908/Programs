import java.util.*;

class abc {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=0;
        if(in.hasNextInt()){
            t = in.nextInt();
        }
        for(int i = 0; i < t; i++) {
            int n = 0;
            int k = 0;
            if(in.hasNextInt()){
                n = in.nextInt();
            }
            if(in.hasNextInt()){
                k = in.nextInt();
            }
            if(isSortingPossible(n, k, in)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static class Data {
        int index;
        int val;

        public Data(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }

    public static boolean isSortingPossible(int n, int k, Scanner in) {
        List<Data> dataList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
              if(in.hasNextInt())
                  dataList.add(new Data(i, in.nextInt()));
        }
        dataList.sort(Comparator.comparingInt((Data data) -> data.val));
        for (int i = 0; i < dataList.size(); i++) {
            if((dataList.get(i).index - i) % k != 0) {
                return false;
            }
        }
        return true;
    }
}
