package Room;

import interfaces.ILoot;
import interfaces.IQuest;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Room {
    private HashMap<ILoot, Integer> loot;
    private ArrayList<IQuest> party;

    public Room() {
        this.loot = new HashMap<>();
        this.party = new ArrayList<>();
    }
}
