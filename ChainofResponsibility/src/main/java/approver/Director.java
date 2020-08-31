package approver;

import request.PurchaseRequest;

public class Director extends Approver{
    public Director(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
