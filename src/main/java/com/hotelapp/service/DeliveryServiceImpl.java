package com.hotelapp.service;

import com.hotelapp.models.Delivery;
import com.hotelapp.repo.DeliveryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

    DeliveryRepo deliveryRepo;

    @Autowired
    public DeliveryServiceImpl(DeliveryRepo deliveryRepo) {
        this.deliveryRepo = deliveryRepo;
    }

    //************************************************************************************

    @Override
    public void updateDelivery(Delivery delivery) {
        deliveryRepo.save(delivery);
    }

    @Override
    public void deleteDelivery(int deliveryId) {
        deliveryRepo.deleteById(deliveryId);
    }

    @Override
    @Transactional
    public Delivery getDeliveryById(int deliveryId) {
        return deliveryRepo.findById(deliveryId).get();
    }

    @Override
    @Transactional
    public Delivery getDeliveryByPartner(String partnerName) {
        return deliveryRepo.findByPartnerName(partnerName);
    }
}
