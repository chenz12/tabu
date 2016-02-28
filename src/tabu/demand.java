package tabu;

/**
 * Created by panzer on 2016/2/27.
 */
public class demand {
    int index;
    double lon;
    double lat;
    double service;
    int cat;
    int early;
    int late;
    int partner;
    demand(String a, int num){
        String[] tem = new String[num];
        tem = a.split("//s+");
        index = Integer.valueOf(tem[0]);
        lon = Double.valueOf(tem[1]);
        lat = Double.valueOf(tem[2]);
        service = Double.valueOf(tem[3]);
        cat = Integer.valueOf(tem[4]);
        early = Integer.valueOf(tem[5]);
        late = Integer.valueOf(tem[6]);
        partner = num+1-index;
    }

}
