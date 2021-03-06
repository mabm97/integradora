/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MarcoAntonio
 */
@Entity
@Table(name = "historyexam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historyexam.findAll", query = "SELECT h FROM Historyexam h")
    , @NamedQuery(name = "Historyexam.findById", query = "SELECT h FROM Historyexam h WHERE h.id = :id")
    , @NamedQuery(name = "Historyexam.findByGrade", query = "SELECT h FROM Historyexam h WHERE h.grade = :grade")
    , @NamedQuery(name = "Historyexam.findByDateStart", query = "SELECT h FROM Historyexam h WHERE h.dateStart = :dateStart")
    , @NamedQuery(name = "Historyexam.findByDateEnd", query = "SELECT h FROM Historyexam h WHERE h.dateEnd = :dateEnd")})
public class Historyexam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "grade")
    private float grade;
    @Basic(optional = false)
    @Column(name = "dateStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;
    @Basic(optional = false)
    @Column(name = "dateEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
    @JoinColumn(name = "Alumn_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumn alumnid;
    @JoinColumn(name = "applicationExam_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Applicationexam applicationExamid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historyExamid", fetch = FetchType.LAZY)
    private List<Useranswer> useranswerList;

    public Historyexam() {
    }

    public Historyexam(Integer id) {
        this.id = id;
    }

    public Historyexam(Integer id, float grade, Date dateStart, Date dateEnd) {
        this.id = id;
        this.grade = grade;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Alumn getAlumnid() {
        return alumnid;
    }

    public void setAlumnid(Alumn alumnid) {
        this.alumnid = alumnid;
    }

    public Applicationexam getApplicationExamid() {
        return applicationExamid;
    }

    public void setApplicationExamid(Applicationexam applicationExamid) {
        this.applicationExamid = applicationExamid;
    }

    @XmlTransient
    public List<Useranswer> getUseranswerList() {
        return useranswerList;
    }

    public void setUseranswerList(List<Useranswer> useranswerList) {
        this.useranswerList = useranswerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historyexam)) {
            return false;
        }
        Historyexam other = (Historyexam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integradora.Historyexam[ id=" + id + " ]";
    }
    
}
