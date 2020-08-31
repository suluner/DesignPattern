package approver;

import request.PurchaseRequest;

public class President extends Approver{

    public President(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
    }
}
