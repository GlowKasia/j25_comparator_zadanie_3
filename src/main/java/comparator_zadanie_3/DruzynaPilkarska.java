package comparator_zadanie_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DruzynaPilkarska {
    private String nazwa;
    private int bramkiStracone, bramkiTrafione,
                meczeWygrane, meczePrzegrane,
                meczeZreisowane, liczbaPunktow;
}
