package com.couponservice.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class CouponApplicationTests {

    @MockBean
    CouponRepository couponRepository;

    @Autowired
    CouponController couponController;


    @Test
    public void getAllCouponsTest() {
        when(couponRepository.findAll()).thenReturn(   //return the list of records
                Stream.of(
                                new Coupon("", "amazon", "amaz12", "mobiles", "10% offer","22-05-2022"))
                        .collect(Collectors.toList()));
        assertEquals(1, couponController.getAllCoupons().size());//we comparing it with the size

    }

    @Test
    public void addCouponTest() {
        Coupon coupon = new Coupon("", "amazon", "ama12", "mobiles", "10% offer","22-05-2022");
        when(couponRepository.save(coupon)).thenReturn(coupon);
        assertEquals(coupon, couponController.addCoupon(coupon));
    }

    @Test
    public void deleteDealTest() {

        String couponId = "1";

        Coupon coupon = new Coupon("1", "amazon", "ama12", "mobiles", "10% offer","22-05-22");
        couponRepository.deleteById(couponId);
        verify(couponRepository).deleteById(couponId);


    }
}