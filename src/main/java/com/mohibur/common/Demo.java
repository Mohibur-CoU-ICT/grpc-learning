package com.mohibur.common;

import com.mohibur.sec06.BankService;
import com.mohibur.sec06.TransferService;

public class Demo {
    public static void main(String[] args) {
        GrpcServer.create(new BankService(), new TransferService())
                .start()
                .await();
    }
}
