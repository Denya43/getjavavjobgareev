package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.Person;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.ShareOfBusiness;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Denis on 01.04.2020.
 */
@XStreamAlias("Organization")
public class Organization implements Serializable {
    private static final long serialVersionUID = 1L;

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;
    @XStreamAlias("type")
    private OrganizationType type;
    @XStreamAlias("CEO")
    private Person CEO;
    @XStreamAlias("capital")
    private long authorizedCapital;
    @XStreamAlias("parent")
    private Organization parent;
    private Set<Organization> subsidiaries;
    @XStreamImplicit(itemFieldName = "shareOfBusiness")
    private Set<ShareOfBusiness> shareOfBusinessSet;

    public Organization(String name) {

    }

    public Person getCEO() {
        return CEO;
    }

    public void setCEO(Person CEO) {
        this.CEO = CEO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    this.name =name;
    }
    public OrganizationType getType(){
        return type;
    }
    public void setType(OrganizationType  type){
        this.type = type;
    }
    public long getAuthorizedCapital(){
        return authorizedCapital;
    }
    public void setAuthorizedCapital(long authorizedCapital){
        this.authorizedCapital = authorizedCapital;
    }
    public Organization getParent(){
        return parent;
    }
    public void setParent(Organization parent){
        this.parent = parent;
    }
    public Set<ShareOfBusiness> getShareHolders(){
        return new HashSet<>(shareOfBusinessSet);
    }

    public void addShareHolder(ShareOfBusiness shareOfBusiness){
        if (shareOfBusinessSet == null){
            shareOfBusinessSet = new HashSet<>();

        }
        shareOfBusinessSet.add(shareOfBusiness);
    }

    public Set<Organization> getSubsidiaries(){
        return  subsidiaries;
    }
    public void addChildren(Organization children){
        if (subsidiaries == null){
            subsidiaries = new HashSet<>();
        }
        subsidiaries.add(children);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        return  name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode(){
        return  name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString(){
        return name;
    }
}
