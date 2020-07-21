public class test6 {
    /**
     * @Description:算算给了多少粒麦子
     * @param grid-放到第几格
     * @return long-麦粒的总数
     */
    public static long getNumberOfWheat(int grid) {
        long sum = 0;  //麦粒的总数
        long numberOfWheatInGrid = 0;  //当前格子里的麦粒数量

        numberOfWheatInGrid = 1; //第一个格子里麦粒的数量
        sum += numberOfWheatInGrid;

        for (int i = 2; i <= grid; i++){
            numberOfWheatInGrid *= 2;
            sum += numberOfWheatInGrid;
        }

        return sum;
    }
}