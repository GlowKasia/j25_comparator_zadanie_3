package comparator_zadanie_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DruzynaPilkarska> druzynaPilkarskas = new ArrayList<>();
        druzynaPilkarskas.add(new DruzynaPilkarska("abc", 1, 5, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abc", 1, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abc", 2, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("abc", 2, 4, 5, 5, 5, 5));
        druzynaPilkarskas.add(new DruzynaPilkarska("aaa", 2, 4, 5, 5, 5, 5));

        Collections.sort(druzynaPilkarskas, new Comparator<DruzynaPilkarska>() {

            public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
                if (o1.getLiczbaPunktow() > o2.getLiczbaPunktow()){
                    return -1;
                } else if (o1.getLiczbaPunktow() < o2.getLiczbaPunktow()){
                    return 1;
                }
                //nie udało mi się wyłonic zwycięscy, więc sprawrdzam drugie kryterium
                if (o1.getBramkiTrafione() > o2.getBramkiTrafione()){
                    return -1;
                } else if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
                    return 1;
                }
                // nie udało mi się wyłonić zwycięzcy, więc sprawdzam trzecie kryterium
                if (o1.getBramkiStracone() > o2.getBramkiStracone()){
                    return 1;
                } else if (o1.getBramkiStracone() < o2.getBramkiStracone()){
                    return -1;
                }
                //nie udało mi się wyłonić zwyciezcy, więc sprawdzam czwarte kryterium
                return o1.getNazwa().compareTo(o2.getNazwa()); //równe ==0
            }
        });
        druzynaPilkarskas.forEach(System.out::println);
    }
}
