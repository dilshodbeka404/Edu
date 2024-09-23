package test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        Hello test = new Hello();

        log.info(">>>>>>>>>>>>>>>>>> startAutoWithdraw => autoWithdrawRequests: {} <<<<<<<<<<<<<<<<<<<", test);
    }
}
