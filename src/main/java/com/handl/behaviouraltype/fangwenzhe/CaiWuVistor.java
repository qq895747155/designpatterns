package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 */
public class CaiWuVistor implements Visitor {
    @Override
    public void zhiChu(ZhiChuBill zhiChuBill) {
        System.out.println("老板: 这个月支出了"+zhiChuBill.getZhiChu());
    }

    @Override
    public void shouRu(ShouRuBill shouRuBill) {
        System.out.println("老板: 这个月收入了"+shouRuBill.getShouRu());
    }
}
