import approver.Approver;
import approver.Director;
import approver.President;
import approver.VicePresident;
import request.PurchaseRequest;

public class MyTest {
    public static void main(String[] args) {
        Approver wjzhang,gyang,jguo;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");


        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"购买《葵花宝典》");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
