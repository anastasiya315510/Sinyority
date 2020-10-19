import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Siniority {
    SENIOR(25001, 41000), JUNIOR(0,10000), MIDDLE(10001,25000);

    public final int minSalary;
    public final int maxSalary;



    public static Siniority findBySalary(int salary){
        Siniority [] siniorities= values();
        Siniority res;
        for(Siniority sinority: siniorities){
            if(sinority.minSalary<=salary & salary<=sinority.maxSalary){
                return sinority;
            }
        }
        throw new IllegalStateException(salary+"its out of list");

        }

    }


