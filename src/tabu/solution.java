package tabu;

import java.util.ArrayList;

/**
 * Created by panzer on 2016/2/28.
 */
public class solution {
    ArrayList<ArrayList<pair>> s;
    int num;
    double[] travel;
    solution(int i) {
        num = i;
        s = new ArrayList<ArrayList<pair>>();
        travel = travel_time();
    }
    double sum(double[] i){
        double res = 0;
        for (double a:i
             ) {
            res += a;
        }
        return  res;
    }

    double[] travel_time(){
        double[] start = new double[num/2];
        double[] end   = new double[num/2];
        double[] res   = new double[num/2];
        for(int i=0;i<num/2; i++){
            for(ArrayList<pair> j : s){
                for (pair k : j){
                    if (i==k.pre){
                        start[i] = k.start_time;
                    }
                for (pair p: j){
                    if (i+num/2==p.pre){
                        end[i] = p.arrive_time;
                    }
                }
                }
                if (end[i]!=0){
                    break;
                }
            }
            res[i] = end[i] - start[i];
        }
        return res;
    }
}

class pair{
    double arrive_time;
    double start_time;
    double lack_servece;
    double time_window;
    int pre;
    int suc;
    int num;
}