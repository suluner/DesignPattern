package observer;

import subject.AllyControlCenter;

public interface Observer {
    public void help();
    public String getName();
    public void setName(String name);
    public void beAttacked(AllyControlCenter acc);
}
