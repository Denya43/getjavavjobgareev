package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.Organization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis on 01.04.2020.
 */
public class ShareOfBusiness extends Person{
    private static final  long serialVrsnUID = 1L;

    @XStreamImplicit
    private List<Share> shares = new ArrayList<>();


    public ShareOfBusiness(){}

    public ShareOfBusiness(String surname){
        super(surname);
    }

    public void addShare(float percentageOfShares, Organization org){
        shares.add(new Share(percentageOfShares, org));
    }
    public List<Share> getShares(){
        return shares;
    }

    @Override
    public String toString() {
        return super.getSurname();
    }

    @XStreamAlias("Shares")
    public static class Share implements Serializable{
        private static final long serialVrsnUID = 1L;

        @XStreamAlias("percentage")
        private float percentageOfShares;
        @XStreamAlias("organization")
        private Organization org;

        public Share(float percentageOfShares, Organization org){
            this.percentageOfShares = percentageOfShares;
            this.org = org;
        }
        public float getPercentageOfShares(){return percentageOfShares;}
        public Organization getOrganization(){return org;}

    }

}
