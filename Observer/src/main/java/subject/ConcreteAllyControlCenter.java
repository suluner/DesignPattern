package subject;

import observer.Observer;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public void notifyObserver(String name) {
        System.out.println("紧急通知：盟友" + name + "正在遭受攻击，请求支援！");
        for(Observer obs : players){
            if(!obs.getName().equalsIgnoreCase(name)){
                obs.help();
            }
        }
    }

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println("战队" + allyName + "组建成功。");
        this.allyName = allyName;
    }
}
