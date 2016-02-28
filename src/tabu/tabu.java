package tabu;

/**
 * Created by panzer on 2016/2/27.
 */
public class tabu {
    demand[] demands;
    int car_num;
    int demand_num;
    int max_time;
    int[] capacity;
    int[] max_travel_time;
    double[][] distance;

    static double c1;
    static double c2;
    static double c3;
    static double c4;
    static double c5;

    double cost(solution so){
        double c_cost=0; //运营成本
        double q_cost=0; //载客量超出成本
        double d_cost=0; //服务时间缺少成本
        double w_cost=0; //时间窗超出成本
        //double t_cost=0; //旅行时间超出成本

        int m = so.s.size();
        for (int i=0;i<m;i++) {
            for (pair a : so.s.get(i)
                 ) {
                c_cost += distance[a.pre][a.suc];
                q_cost += over(a.num-capacity[i]);
                d_cost += over(a.lack_servece);
                w_cost += over(a.time_window);
            }
        }
        return  c_cost+q_cost+d_cost+w_cost+so.sum(so.travel);

    }

    int over(int a){
        if (a>0){
            return a;
        }
        else return 0;
    }
    double over(double a){
        if (a>0){
            return a;
        }
        else return 0;
    }

}
