package adapter;

import adaptee.Adaptee;

public interface Target {
    public void request();
    public void setAdaptee(Adaptee adaptee);
}
