package day31_Constructures;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

    Offer offer1 = new Offer();
    offer1.setInfo("VA","Amazon Inc","SDET", 110000,true,true,true,true);

    Offer offer2 = new Offer();
    offer2.setInfo("CA","Sony Inc","QA",120000,true,false,false,true);

    Offer offer3 = new Offer();
    offer3.setInfo("FL","Apple Inc","QA",125000,true,true,true,false);

    Offer offer4 = new Offer();
    offer4.setInfo("TX", "CapitalOne","SM", 115000, false,false,true,true);

    Offer offer5 = new Offer();
    offer5.setInfo("WA", "Bank Of Amerrica","BA",130000, true,true,false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);


        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> !p.isFullTime); // removes if the offer not full time

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA"));

        System.out.println(localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName +":" +localOffer.salary);
        }














    }







}
