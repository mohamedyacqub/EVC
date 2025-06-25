import java.util.Scanner;

class EvcPLus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dail up");
        String dail_up = input.next();
        String dail = "*770#";
        int pass = 2025;
        double balance = 100;
        //wajiga hore ee EVC
        if (dail_up.equals(dail)) {
            System.out.println("- EVCPLUS -");
            System.out.println("faldan geli pin-kaaga(Enter pin)");
            //password
            int user_pass = input.nextInt();
            if (pass == user_pass) {
                System.out.println("EVCPLUS");
                System.out.println("1. Itus Haraaga");
                System.out.println("2. kaarka hadalka");
                System.out.println("3. Bixi Biil");
                System.out.println("4.U wareeji EVCPLUS");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8. TAAJ");
                System.out.println("9. Bill Payment");
                //dooro number sax ah
                int dooro = input.nextInt();
                switch (dooro) {
                    //1. qeybta hagaaga
                    case 1:
                         System.out.println("[-EVCPLUS-] Haraagaagu waa $" + balance);
                        break;
                    //2.qeybta kaarka hadalka
                    case 2:
                        System.out.println("Kaarka hadalka");
                        System.out.println("1. Ku shubo Airtime");
                        System.out.println("2. Ugu shubo Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. Ku shubo Internet");
                        System.out.println("5. Ugu shub qof kale (MMT)");
                        //qeybta ku shubo airtime
                        int kaarka_hadalka = input.nextInt();
                        switch (kaarka_hadalka) {
                            case 1:
                                System.out.println("Fadlan Gali lacagta");
                                double kaarka_lacgta = input.nextDouble();
                                System.out.println("Fadlan Geli numberka");
                                int mob_kaarka = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + kaarka_lacgta + " ku shubtid undefined?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int hubin = input.nextInt();
                                switch (hubin) {
                                    case 1:
                                        if (balance >= kaarka_lacgta) {
                                            System.out.println("waad guuleysady inaa lacagta u shubto" + mob_kaarka + " \n haraagaga hada waa $" + (balance - kaarka_lacgta));


                                        } else System.out.println("haraagagu kuma filano");
                                        break;
                                    case 2:
                                        System.out.println("OK");
                                        break;


                                }
                                break;
                            //2. ugu shubo airtime
                            case 2:
                                System.out.println("Fadlan Geli mobile-ka");
                                int num_qofka = input.nextInt();
                                System.out.println("Fadlan Geli lacagta");
                                double qofka_lcgta = input.nextDouble();

                                System.out.println("Ma hubtaa inaad $" + qofka_lcgta + " ku shubtid " + num_qofka + "?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int ugushubo_hubin = input.nextInt();
                                switch (ugushubo_hubin) {
                                    case 1:
                                        if (balance >= qofka_lcgta) {
                                            System.out.println("waad guuleysady inaa lacagta u shubtid " + num_qofka + " \n haraagaga hada waa $" + (balance - qofka_lcgta));

                                        } else System.out.println("haraagagu kuma filano");

                                        break;
                                    case 2:
                                        System.out.println("OK");
                                        break;

                                }


                                //3.qeybta MIFI Packages
                            case 3:
                                System.out.println("EVCPlus");
                                System.out.println("1. Ku shubo Data-da MIFI");
                                int data = input.nextInt();
                                if (data == 1) {
                                    System.out.println("-Internet Bundle Recharge-");
                                    System.out.println("1. Isbuucle(Weekly)");
                                    System.out.println("2. maalinle(Daily)");
                                    System.out.println("3. Bille(MiFi)");
                                    int MIFI = input.nextInt();
                                    switch (MIFI) {
                                        case 1:
                                            // adeega isbuucle
                                            System.out.println("fadlan dooro bundle ka");
                                            System.out.println("1. $5= 10 GB ");
                                            System.out.println("2. $10=25 GB ");
                                            double lacgta_1 = 5;
                                            double lacgta_2 = 10;
                                            int isbuucle = input.nextInt();
                                            switch (isbuucle) {
                                                case 1:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int isbucle_user = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + lacgta_1 + " ugu shubtid " + isbucle_user + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int isbucle_hubin = input.nextInt();
                                                    switch (isbucle_hubin) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $5 isbuucle ah" + " \n haraagaga hada waa $" + (balance - lacgta_1));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");

                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int user_isbucle = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + lacgta_2 + " ugu shubtid " + user_isbucle + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int Isubcle_hubin = input.nextInt();
                                                    switch (Isubcle_hubin) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $10 isbuucle ah" + " \n haraagaga hada waa $" + (balance - lacgta_2));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");


                                                    }
                                                    break;
                                                default:
                                                    System.out.println("number sax ah dooro ");

                                            }
                                            break;

                                        case 2:
                                            //  adeega maalinle
                                            System.out.println("fadlan dooro bundle ka");
                                            System.out.println("1. $1= 2 GB ");
                                            System.out.println("2. $2=5 GB ");
                                            double malinle_1 = 2;
                                            double malinle_2 = 5;
                                            int malinle = input.nextInt();
                                            switch (malinle) {
                                                case 1:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int mlnle_user = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + malinle_1 + " ugu shubtid " + mlnle_user + " ?" + " \n haraagaga hada waa $" + (balance - malinle_1));
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int Mlnle_hubin = input.nextInt();
                                                    switch (Mlnle_hubin) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $2 maalinle ah" + " \n haraagaga hada waa $" + (balance - malinle_1));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");


                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int user_malnle = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + malinle_2 + " ugu shubtid " + user_malnle + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int mlnle_hubin = input.nextInt();
                                                    switch (mlnle_hubin) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $2 maalinle ah" + " \n haraagaga hada waa $" + (balance - malinle_2));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");

                                                    }
                                                    break;

                                                default:
                                                    System.out.println("number sax ah dooro ");


                                            }
                                            break;
                                        case 3:
                                            // adeega bille
                                            System.out.println("fadlan dooro bundle ka");
                                            System.out.println("1. $20= 40 GB ");
                                            System.out.println("2. $40=85 GB ");
                                            System.out.println("3. $60= 150 GB ");
                                            System.out.println("4. $30= monthly unlimit ");
                                            double bille_1 = 20;
                                            double bille_2 = 40;
                                            double bille_3 = 60;
                                            double bille_4 = 30;
                                            int bille = input.nextInt();
                                            switch (bille) {
                                                case 1:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int user_1 = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + bille_1 + " ugu shubtid " + user_1 + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int Bille_hubin1 = input.nextInt();
                                                    switch (Bille_hubin1) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $20 bille ah" + " \n haraagaga hada waa $" + (balance - bille_1));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");


                                                    }

                                                    break;
                                                case 2:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int user_2 = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + bille_2 + " ugu shubtid " + user_2 + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");

                                                    int Bille_hubin2 = input.nextInt();
                                                    switch (Bille_hubin2) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $40 bille ah" + " \n haraagaga hada waa $" + (balance - bille_2));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");

                                                    }

                                                    break;
                                                case 3:
                                                    System.out.println("fadlan Gali MIFI user");
                                                    int user_3 = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + bille_3 + " ugu shubtid " + user_3 + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int Bille_hubin3 = input.nextInt();
                                                    switch (Bille_hubin3) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $60 bille ah" + " \n haraagaga hada waa $" + (balance - bille_3));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");

                                                    }

                                                    break;
                                                case 4:
                                                    System.out.println("fadlan Gali MIFI user");

                                                    int user_4 = input.nextInt();
                                                    System.out.println("Ma hubtaa inaad $" + bille_4 + " ugu shubtid " + user_4 + " ?");
                                                    System.out.println("1. haa");
                                                    System.out.println("2. maya");
                                                    int Bille_hubin4 = input.nextInt();
                                                    switch (Bille_hubin4) {
                                                        case 1:
                                                            System.out.println("waad ku guuleysaday inaad ku shubtid $30 monthnly unlimit" + " \n haraagaga hada waa $" + (balance - bille_4));
                                                            break;
                                                        case 2:
                                                            System.out.println("ok");
                                                            break;
                                                        default:
                                                            System.out.println("number sax soo gali");

                                                    }


                                            }


                                            break;
                                        default:
                                            System.out.println(" fadlan dooro number sax ah");
                                    }

                                } else System.out.println(" fadlan dooro number sax ah");
                                break;
                            //4. ku shubo internet

                            case 4:
                                System.out.println("Fadlan dooro number-ka ku shubeyso");
                                System.out.println("1. Isbuucle(Weekly)");
                                System.out.println("2.TIMES BASED PACKAGES");
                                System.out.println("3. DATA");
                                System.out.println("4. Maalinle (Daily)");
                                System.out.println("5. Bille(MiFi)");
                                int ku_shubo_intenet = input.nextInt();
                                switch (ku_shubo_intenet) {
                                    case 1:
                                        System.out.println("fadlan geli lacagta");
                                        double Lcgta_shubo = input.nextDouble();
                                        System.out.println("fadlan gali mobile-ka");
                                        int Mob_user = input.nextInt();

                                        System.out.println("Ma hubtaa inaad $" + Lcgta_shubo + " ugu shubtid " + Mob_user + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int _datahubin = input.nextInt();
                                        switch (_datahubin) {
                                            case 1:
                                                if (balance >= Lcgta_shubo) {
                                                    System.out.println("waad ku guuleysaday inaad ku shubtid $" + Lcgta_shubo + " data internet-ah" + " \n haraagaga hada waa $" + (balance - Lcgta_shubo));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("number sax soo gali");
                                        }


                                        break;
                                    //TIMES BASED PACKAGES
                                    case 2:
                                        System.out.println("fadlan geli lacagta");
                                        double times_based = input.nextDouble();
                                        System.out.println("fadlan gali mobile-ka");
                                        int Mobile_user = input.nextInt();

                                        System.out.println("Ma hubtaa inaad $" + times_based + " ugu shubtid " + Mobile_user + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HUBIN = input.nextInt();
                                        switch (HUBIN) {
                                            case 1:
                                                if (balance >= times_based) {
                                                    System.out.println("waad ku guuleysaday inaad ku shubtid $" + times_based + " data internet-ah" + " \n haraagaga hada waa $" + (balance - times_based));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("number sax soo gali");
                                        }


                                        break;
                                    // DATA
                                    case 3:
                                        System.out.println("fadlan geli lacagta");
                                        double Time_data = input.nextDouble();
                                        System.out.println("fadlan gali mobile-ka");
                                        int Mobile_users = input.nextInt();

                                        System.out.println("Ma hubtaa inaad $" + Time_data + " ugu shubtid " + Mobile_users + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HUBIN_dooro = input.nextInt();
                                        switch (HUBIN_dooro) {
                                            case 1:
                                                if (balance >= Time_data) {
                                                    System.out.println("waad ku guuleysaday inaad ku shubtid $" + Time_data + " data internet-ah" + " \n haraagaga hada waa $" + (balance - Time_data));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("number sax soo gali");
                                        }


                                        break;
                                    //Maalinle (Daily)
                                    case 4:
                                        System.out.println("fadlan soo geli lacagta");
                                        double daily = input.nextInt();
                                        System.out.println("fadlan soo geli mobile-ka");
                                        int mob_input = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + daily + " ugu shubtid " + mob_input + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int HBN = input.nextInt();
                                        switch (HBN) {
                                            case 1:
                                                if (balance >= daily) {
                                                    System.out.println("waad ku guuleysaday inaad ku shubtid $" + daily + " data internet-ah" + " \n haraagaga hada waa $" + (balance - daily));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("number sax soo gali");
                                        }

                                        break;
                                    // bille(monthly)
                                    case 5:
                                        System.out.println("fadlan soo geli lacagta");
                                        double monthly = input.nextInt();
                                        System.out.println("fadlan soo geli mobile-ka");
                                        int Mob_input = input.nextInt();

                                        System.out.println("Ma hubtaa inaad $" + monthly + " ugu shubtid " + Mob_input + " ?");
                                        System.out.println("1. haa");
                                        System.out.println("2. maya");
                                        int _HUBIN = input.nextInt();
                                        switch (_HUBIN) {
                                            case 1:
                                                if (balance >= monthly) {
                                                    System.out.println("waad ku guuleysaday inaad ku shubtid $" + monthly + " data internet-ah oo bile ah" + " \n haraagaga hada waa $" + (balance - monthly));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("number sax ah soo geli");
                                        }


                                        break;
                                    default:
                                        System.out.println("number sax ah soo geli");

                                }
                                break;
                            //5. Ugu shub qof kale (MMT)
                            case 5:
                                System.out.println("fadlan soo geli mobile-ka");
                                int qofka_kale = input.nextInt();
                                System.out.println("fadlan soo geli lacagta");
                                double lcgta_qofka = input.nextInt();

                                System.out.println("Ma hubtaa inaad $" + lcgta_qofka + " ugu shubtid " + qofka_kale + " ?");
                                System.out.println("1. haa");
                                System.out.println("2. maya");
                                int hubin_dooro = input.nextInt();
                                switch (hubin_dooro) {
                                    case 1:
                                        if (balance >= lcgta_qofka) {
                                            System.out.println("waad ku guuleysaday inaad ugu shubtid " + qofka_kale + " \n haraagaga hada waa $" + (balance - qofka_kale));


                                        } else System.out.println("haraagagu kuma filno");
                                    case 2:
                                        System.out.println("ok");
                                        break;
                                    default:
                                        System.out.println("number sax ah soo geli");
                                }

                                break;
                            default:
                                System.out.println(" fadlan number sax soo dooro");


                        }

                        break;
                    // bixi biil
                    case 3:
                        System.out.println("Bixi Biil");
                        System.out.println("1. Post Paid  ");
                        System.out.println("2.ku Iibso");
                        int bixi_biil = input.nextInt();
                        switch (bixi_biil) {
                            case 1:
                                System.out.println("Post Paid");
                                System.out.println("1. Ogow biil");
                                System.out.println("2. Bixi biil");
                                System.out.println("3.Ka Bixi Biil");

                                int post_paid = input.nextInt();
                                switch (post_paid) {
                                    case 1:
                                        System.out.println("haraagagu waa $" + balance);
                                        break;
                                    case 2:
                                        System.out.println("Fadlan geli lacagta biil-ka");
                                        int biilka_lcgta = input.nextInt();
                                        System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + biilka_lcgta);
                                        System.out.println("1.haa ");
                                        System.out.println("2. maya");
                                        int ogoow_biil = input.nextInt();
                                        switch (ogoow_biil) {
                                            case 1:
                                                if (balance >= biilka_lcgta) {
                                                    System.out.println("waad ku guuleysay inaa bixiso biilka \n haraagagu hada waa $" + (balance - biilka_lcgta));

                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("fadlan soo geli number sax ah");

                                        }
                                        break;
                                    case 3:
                                        System.out.println("fadlan soo geli mobile-ka");
                                        int mob_bixi = input.nextInt();
                                        System.out.println("fadlan geli lacgta");
                                        int lcgta_bixi = input.nextInt();
                                        System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + lcgta_bixi + " oo laga rabo tell NO " + mob_bixi);
                                        System.out.println("1.haa");
                                        System.out.println("2. maya");
                                        int ka_bixi_biil = input.nextInt();
                                        switch (ka_bixi_biil) {
                                            case 1:
                                                if (balance >= lcgta_bixi) {
                                                    System.out.println("waad ku guuleysay inaad bixiso lacagta \n haragaagu hada waa $" + (balance - lcgta_bixi));

                                                } else System.out.println("haragaagu kuma filno ");
                                                break;
                                            case 2:
                                                System.out.println("ok");
                                                break;
                                            default:
                                                System.out.println("fadlan soo geli number sax ah");

                                        }
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");
                                }

                                break;
                            case 2:
                                System.out.println("Fadlan geli agoonsiga ganacsiga");
                                double aqoonsi = input.nextDouble();
                                if (aqoonsi == 1) {
                                    System.out.println("Fadlan Gali Number ka");
                                    int number = input.nextInt();
                                    System.out.println("Fadlan Gali lacagta");
                                    double money = input.nextDouble();
                                    System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n" + "1.haa\n" + "2.maya");
                                    int ku_iibso = input.nextInt();
                                    switch (ku_iibso) {
                                        case 1:
                                            if (balance >= money) {
                                                System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + balance);

                                            }
                                            break;
                                        case 2:
                                            System.out.println("Mahadsanid!");
                                            break;
                                        default:
                                            System.out.println("fadlan soo dooro number sax ah ");
                                    }

                                } else System.out.println("aqoonsigaaga waa qalad");

                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");
                        }


                        break;
                    // U wareeji Evcplus
                    case 4:
                        System.out.println("fadlan geli mobile-ka");
                        int tell = input.nextInt();
                        System.out.println("fadaln geli lacagta");
                        double lcgta_uwareejinka = input.nextDouble();

                        System.out.println("Ma hubtaa inaad $" + lcgta_uwareejinka + " ugu shubtid " + tell + " ?");
                        System.out.println("1. haa");
                        System.out.println("2. maya");
                        int hubin_uwareejida = input.nextInt();
                        switch (hubin_uwareejida) {
                            case 1:
                                if (balance >= lcgta_uwareejinka) {
                                    System.out.println(lcgta_uwareejinka + " $ ayaad uwareejisay " + tell + "\n haraagaga hada waa $" + (balance - lcgta_uwareejinka));
                                } else System.out.println("haraagagu kuma filno ");
                                break;

                            case 2:
                                System.out.println("ok");
                                break;
                            default:
                                System.out.println("number sax ah soo geli");

                        }


                        break;
                    // 5.warbixin kooban
                    case 5:
                        System.out.println("Warbixin Kooban");
                        System.out.println("1. Last Action ");
                        System.out.println("2. Wareejintii u dambeysay");
                        System.out.println("3.Iibsashadii u dambeysay");
                        System.out.println("4.Last 3 Action");
                        System.out.println("5. Email Me My ACtivity");
                        int warbixin_kooban = input.nextInt();
                        switch (warbixin_kooban) {
                            case 1:
                                System.out.println("$100 Ayaad u wareejisay +252615991582, Taariikh: 18/03/24 13:03:15");
                                break;
                            case 2:
                                System.out.println("Statementiga");
                                System.out.println("1. U dirtay");
                                System.out.println("2.kaheshay");
                                int statement = input.nextInt();
                                switch (statement) {
                                    case 1:
                                        System.out.println("fadlan geli mobile-ka");
                                        int dirtay = input.nextInt();
                                        System.out.println("$10 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 18/01/24 14:03:16");
                                        break;
                                    case 2:
                                        System.out.println("fadlan geli mobile-ka");
                                        int kaheshay = input.nextInt();
                                        System.out.println("$10 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 18/01/24 14:03:16");
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number ah");

                                }
                            case 3:
                                break;
                            case 4:
                                System.out.println("$100 Ayaad u wareejisay +252615991582, Taariikh: 18/03/24 13:03:15");
                                System.out.println("$90 Ayaad u wareejisay +252615001582, Taariikh: 18/03/24 13:27:15");
                                System.out.println("$101 Ayaad u wareejisay +252615008992, Taariikh: 18/03/24 13:28:15");

                                break;
                            case 5:
                                System.out.println("your request is being processed and the activity will be emailed to mabdillahi276@gmail.com");
                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");


                        }
                        break;
//salaam bank
                    case 6:
                        System.out.println("Salaam Bank");
                        System.out.println("1. Itus haraaga");
                        System.out.println("2. Lacag dhigasho");
                        System.out.println("3. Lacag qaadasho");
                        System.out.println("4. Ka wareeji EVCPlus");
                        System.out.println("5. Ka wareeji Account-kaga");
                        System.out.println("6. hubi wareeji account");
                        System.out.println("7. Maareynta Bankiga");
                        int ac_pass = 123456;
                        double ac_balance = 100;


                        int salam_bank = input.nextInt();
                        switch (salam_bank) {
                            case 1:
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirta = input.nextInt();
                                if (num_sirta == ac_pass) {
                                    System.out.println("haragaaga bangiga waa:" + ac_balance + "USD");
                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 2:
                                System.out.println("fadlan geli lacagta");
                                int lcg_dhigasho = input.nextInt();
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirt1 = input.nextInt();
                                if (num_sirt1 == ac_pass) {
                                    System.out.println("Ma hubtaa inaad $" + lcg_dhigasho + " dhigatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
                                    int dhigasho_hubin = input.nextInt();
                                    switch (dhigasho_hubin) {
                                        case 1:
                                            if (ac_balance >= lcg_dhigasho) {
                                                System.out.println("USD " + lcg_dhigasho + " ayaa dhigatay koontadaada bangiga" + "\n haragaagu hada waa: $" + (ac_balance + lcg_dhigasho));
                                            } else System.out.println("haragaagu kuma filno");
                                            break;
                                        case 2:
                                            System.out.println("ok");
                                            break;
                                        default:
                                            System.out.println("number sax ah soo geli");
                                    }

                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 3:
                                System.out.println("fadlan geli lacagta");
                                int lcg_qaadasho = input.nextInt();
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirt2 = input.nextInt();
                                if (num_sirt2 == ac_pass) {
                                    System.out.println("Ma hubtaa inaad $" + lcg_qaadasho + " qaadatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
                                    int qaadasho_hubin = input.nextInt();
                                    switch (qaadasho_hubin) {
                                        case 1:
                                            if (ac_balance >= lcg_qaadasho) {
                                                System.out.println("USD " + lcg_qaadasho + " ayaa kala baxday koontadaada bangiga" + "\n haragaagu hda waa: $" + (ac_balance - lcg_qaadasho));
                                            } else System.out.println("haragaagu kuma filno");
                                            break;
                                        case 2:
                                            System.out.println("ok");
                                            break;
                                        default:
                                            System.out.println("number sax ah soo geli");
                                    }


                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 4:
                                //4. Ka wareeji EVCPlus
                                System.out.println("fadlan soo dooro xisaabta bangiga");
                                System.out.println("SALAAM SOMALI BANK");
                                int salaam_dooro = input.nextInt();
                                if (salaam_dooro == 1) {
                                    System.out.println("fadlan soo geli account-ka");
                                    int account = input.nextInt();
                                    System.out.println("fadlan geli macluumad");
                                    int macluumad = input.nextInt();
                                    System.out.println("fadlan soo geli lacagta");
                                    double LCGTA = input.nextDouble();
                                    System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                    int num_sirt3 = input.nextInt();
                                    if (num_sirt3 == ac_pass) {
                                        System.out.println("Ma hubtaa inaa u dhigatay  accounta NO:" + account + " ? \n 1.Haa \n 2. Maya");
                                        int Dooro = input.nextInt();
                                        switch (Dooro) {
                                            case 1:
                                                if (balance >= LCGTA) {
                                                    System.out.println("waad ku guuleysay inaa dhigato  ACCOUNT NO:" + account);

                                                } else System.out.println("haragagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("mahadsanid!");
                                                break;
                                            default:
                                                System.out.println("fadlan soo geli number sax ah");

                                        }
                                    } else System.out.println("fadlan soo dooro number sax ah ");

                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");

                                break;
                            case 5:
                                //5. Ka wareeji Account-kaga"
                                System.out.println("fadlan soo geli account ama mobile");
                                int account = input.nextInt();
                                System.out.println("fadlan soo geli lacagta");
                                double Lcgta1 = input.nextDouble();
                                System.out.println("fadlan soo geli macluumad");
                                String macluumad1 = input.next();
                                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                int num_sirt4 = input.nextInt();
                                if (num_sirt4 == ac_pass) {
                                    System.out.println("Ma hubtaa inaad USB" + Lcgta1 + "u wareejiso Bank Account NO:" + account + "? \n 1.Haa \n 2. Maya");
                                    int bixin = input.nextInt();
                                    switch (bixin) {
                                        case 1:
                                            System.out.println("waad ku guuleysay inaad u wareejiso lacagtan");
                                            break;
                                        case 2:
                                            System.out.println("mahadsanid!");
                                            break;
                                        default:
                                            System.out.println("fadlan soo geli number sax ah");
                                    }

                                } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                break;
                            case 6:
                                // 6.hubi wareeji account
                                System.out.println("fadlan geli OTP");
                                int otp = input.nextInt();
                                System.out.println("Ma hubtaa in aad aqbasho lacgta diridan \n 1.Haa \n 2.Maya");
                                int otp_hubin = input.nextInt();
                                switch (otp_hubin) {
                                    case 1:
                                        System.out.println("waad ku guuleysay inaa ku dirto lacgta account to account");
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid!");
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");
                                }
                                break;
                            case 7:
                                // 7. Maareynta Bankiga
                                System.out.println(" Maareynta Bankiga");
                                System.out.println("1. Bedel PIN-ka Bangiga");
                                System.out.println("2.Bedel Passwordka Ebank");
                                int maareynta = input.nextInt();
                                switch (maareynta) {
                                    case 1:
                                        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                        int num_sirt5 = input.nextInt();
                                        System.out.println("Fadlan Geli pin-ka cusub ee bangiga");
                                        int num_sirt6 = input.nextInt();
                                        System.out.println("hubi pin-ka cusub");
                                        int num_sirt7 = input.nextInt();
                                        if (num_sirt5 == ac_pass) {
                                            if (num_sirt6 != num_sirt5) {
                                                if (num_sirt6 == num_sirt7) {
                                                    System.out.println("waad ku guuleysay inaa badasho pin-kaaga bangiga");

                                                } else System.out.println("fadlan iska hubi pin-kaga cusub");
                                            } else
                                                System.out.println("fadlan iska hubi number sireed ka cusub inuusan la mid aheyn number sireed kaagi hore ee bangiga");

                                        } else System.out.println("numberkaaga sirta ee bangiga waa qalad");
                                        break;
                                    case 2:
                                        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                                        int num_sirt8 = input.nextInt();
                                        System.out.println("error occurred ,please try again later");
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");


                                }
                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");

                        }


                        break;
                    // maareynta
                    case 7:
                        System.out.println("Maareynta ");
                        System.out.println("1.Bedel Lambarka Sirta");
                        System.out.println("2. Bedel Luqadda");
                        System.out.println("3. Wargellin Mobile Lumay");
                        System.out.println("4. Lacag Xirasho");
                        System.out.println("5. U celli Lacag Qaldantay");
                        System.out.println("6. EnableMobileBanking");


                        int Maareynta = input.nextInt();
                        switch (Maareynta) {
                            case 1:
                                System.out.println("Fadlan Gelli PIN-Kaaga Cusub");
                                int PIN_Cusub = input.nextInt();
                                System.out.println("Hubi PIN-Kaaga Cusub");
                                int Hubi_Cusub = input.nextInt();
                                if (PIN_Cusub == Hubi_Cusub) {
                                    System.out.println("<-EVCPlus-> Waad Ku guuleysatay in aad badasho PIN-kaaga");
                                } else
                                    System.out.println("Kuma aadan Guleysan inaad badasho pinkaaga");
                                break;


                            case 2:
                                System.out.println("Falan Dooro luqada");
                                System.out.println("1.English");
                                System.out.println("2. Soomaali");
                                int luqadda = input.nextInt();
                                switch (luqadda) {
                                    case 1:
                                        System.out.println("<-EVCPlus-> you are succesfully changed your language");
                                        break;
                                    case 2:
                                        System.out.println("<-EVCPLus-> Waad ku guuleysatey inaad badasho luqadda");
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");

                                }
                                break;
                            case 3:
                                System.out.println("Fadlan Geli Mobile-ka lumay");
                                int mobile_lumay = input.nextInt();

                                System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan " + mobile_lumay + "\n 1. haa \n 2. maya");
                                int mob_lumay = input.nextInt();
                                switch (mob_lumay) {
                                    case 1:
                                        System.out.println("waad ku guuleysay inaa u diiwan geliso mobile-lumay");
                                        break;
                                    case 2:
                                        System.out.println("ok");
                                        break;
                                    default:
                                        System.out.println("fadlan soo geli number sax ah");
                                }
                                break;
                            case 4:
                                System.out.println("fadlan Geli numberka khalad ah");
                                int num_khalad = input.nextInt();
                                System.out.println("faldan geli numberkii loo rabay");
                                int num_loo_rabay = input.nextInt();
                                if (num_khalad == num_loo_rabay) {
                                    System.out.println("Ma hubtaa inaa aad xirto lacagtan ? \n 1. haa \n 2. maya");
                                    int Lacag_Xirasho = input.nextInt();
                                    switch (Lacag_Xirasho) {
                                        case 1:
                                            System.out.println("waad ku guuleysay inaa xirato lacagtaan");
                                            break;
                                        case 2:
                                            System.out.println("ok");
                                            break;
                                        default:
                                            System.out.println("fadlan geli number sax ah");

                                    }

                                } else System.out.println("dhaqdhaaqaan ma ahan mid jira");
                                break;
                            case 5:
                                System.out.println("fadlan Geli aqoonsiga lacag diridda");
                                int mob_celis = input.nextInt();
                                System.out.println("Ma hubtaa in aad celiso lacgtan ? " + mob_celis);
                                int hubinta_lacgta_celis = input.nextInt();
                                switch (hubinta_lacgta_celis) {
                                    case 1:
                                        System.out.println("waad ku guuleysay inaa celiso lacagta");
                                        break;
                                    case 2:
                                        System.out.println("ok");
                                        break;
                                    default:
                                        System.out.println("number sax soo geli");
                                }
                                break;
                            case 6:
                                System.out.println("fadlan  geli  number-ka is diiwan gelinta");
                                int num_is_diiwan = input.nextInt();
                                System.out.println(num_is_diiwan + " Activation record was found");
                                break;
                            default:
                                System.out.println("fadlan soo geli number sax ah");


                        }
                        break;
                    //taaj
                    case 8:
                        System.out.println("Taaj");
                        System.out.println("1. Gudaha");
                        System.out.println("2. Dibada");
                        System.out.println("3. Ogoow Khidmada");
                        int Options_of_taaj = input.nextInt();
                        switch (Options_of_taaj) {
                            //1.gudaha
                            case 1:
                                System.out.println("Fadlan dooro shirkada\n1.E-KAAFI\n2.E-SAHAL");
                                //* e_kaafi*
                                int e_kaafi = input.nextInt();
                                switch (e_kaafi) {
                                    case 1:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        int number1 = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        String number2 = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        String number3 = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        int number4 = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa\n1.Haa\n2.Maya");
                                        int ogolaansho = input.nextInt();
                                        switch (ogolaansho) {
                                            case 1:
                                                if (balance >= number4) {
                                                    System.out.println("<-EVCPlus-> Waxaad $" + (balance - number4) + "  ugu shubtay Number ka " + (number1));
                                                } else System.out.println("haragaagu kuma filno");
                                                break;
                                            case 2:
                                                System.out.println("waan ka xunahe");

                                                break;
                                            default:
                                                System.out.println("number sax soo geli");


                                        }
                                        break;
                                    case 2:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        int num1 = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        String num2 = input.next();

                                    case 9:
                                        int reference = 613013806;
                                        System.out.println("EVCPlus");
                                        System.out.println("1. itus haraaaga bill ka\n2. Wada Bixi bill ka\n3. Qayb ka bixi Bill");
                                        int BixiBill = input.nextInt();
                                        if (BixiBill < 1 || BixiBill > 3) {
                                            System.out.println("Fadlan dooro number sax ah");
                                            return;
                                        }else {
                                            if (BixiBill == 1){
                                                System.out.println("Fadlan Geli bill reference number");
                                                int user_reference = input.nextInt();
                                                if(reference != user_reference){
                                                    System.out.println("some parameters are missing. please check your request");
                                                }else {
                                                    System.out.println("Haraagaaga bill ku waa $" +  balance);
                                                }

                                            }else if (BixiBill == 2){
                                                System.out.println("Fadlan Geli bill reference number");
                                                int user_reference = input.nextInt();
                                                if(reference != user_reference){
                                                    System.out.println("some parameters are missing. please check your request");
                                                }else {
                                                    System.out.println("Fadlan Geli lagacta bill ka");
                                                    int lacagtaBillka = input.nextInt();
                                                    System.out.println("Ma hubtaa in aad wada bixisay lacagta bill ka una udirtay " + user_reference + " \n1.Haa \n2.Maya");
                                                    int confirm = input.nextInt();
                                                    if(confirm == 1){
                                                        balance -= lacagtaBillka;
                                                        if(lacagtaBillka <1 || lacagtaBillka >  balance  ){
                                                            System.out.println("Haraagaagu kuguma filna");
                                                            break;}
                                                        System.out.println("waxaad wada bixisay lacagta bill ka waxaad na udirtay " +user_reference + " haraagaagu waa $" + balance);
                                                    }else
                                                        System.out.println("Mahadsanid!");
                                                }
                                            }else if (BixiBill == 3){
                                                System.out.println("Fadlan Geli bill reference number");
                                                int user_reference = input.nextInt();
                                                if(reference != user_reference){
                                                    System.out.println("some parameters are missing. please check your request");
                                                }else {
                                                    System.out.println("Fadlan Geli lagacta bill ka");
                                                    int lacagtaBillka = input.nextInt();
                                                    System.out.println("Ma hubtaa in aad Qayb ka bixisay lacagta bill ka una udirtay " + user_reference + " \n1.Haa \n2.Maya");
                                                    int confirm = input.nextInt();
                                                    if(confirm == 1){
                                                        balance  -= lacagtaBillka;
                                                        if(lacagtaBillka <1 || lacagtaBillka > balance  ){
                                                            System.out.println("Haraagaagu kuguma filna");
                                                            break;}
                                                        System.out.println("waxaad Qayb ka bixisay lacagta bill ka waxaad na udirtay " +user_reference + " haraagaagu waa $" + balance);
                                                    }else
                                                        System.out.println("Mahadsanid!");
                                                }
                                            }
                                        }
                                        break;
                                }
                        }
                }
            }






                                }

                        }
                }
