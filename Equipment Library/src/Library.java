import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library extends Object implements Serializable {
    private List<Equipments> collection;

    public Library(){
        collection = new ArrayList<Equipments>();
    }
    public void addEquipments(Equipments equipments){
        collection.add(equipments);
    }

    @Override
    public String toString() {
        String total="\n";
        /*
        for (int i = 0; i < collection.size(); i++) {
            Equipments e = collection.get(i);
            total= total + e.toString();
        }
        */
        Iterator<Equipments> i = collection.iterator();
        while (i.hasNext()){
            Equipments e = (Equipments) i.next(); //casting
            total= total + e.toString();
        }
        return total;
    }
}

