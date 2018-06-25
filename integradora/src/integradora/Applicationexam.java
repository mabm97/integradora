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
@Table(name = "applicationexam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicationexam.findAll", query = "SELECT a FROM Applicationexam a")
    , @NamedQuery(name = "Applicationexam.findById", query = "SELECT a FROM Applicationexam a WHERE a.id = :id")
    , @NamedQuery(name = "Applicationexam.findByDateStart", query = "SELECT a FROM Applicationexam a WHERE a.dateStart = :dateStart")
    , @NamedQuery(name = "Applicationexam.findByDateEnd", query = "SELECT a FROM Applicationexam a WHERE a.dateEnd = :dateEnd")})
public class Applicationexam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dateStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;
    @Basic(optional = false)
    @Column(name = "dateEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationExamid", fetch = FetchType.LAZY)
    private List<Historyexam> historyexamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationExamid", fetch = FetchType.LAZY)
    private List<Question> questionList;
    @JoinColumn(name = "Exam_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Exam examid;

    public Applicationexam() {
    }

    public Applicationexam(Integer id) {
        this.id = id;
    }

    public Applicationexam(Integer id, Date dateStart, Date dateEnd) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @XmlTransient
    public List<Historyexam> getHistoryexamList() {
        return historyexamList;
    }

    public void setHistoryexamList(List<Historyexam> historyexamList) {
        this.historyexamList = historyexamList;
    }

    @XmlTransient
    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Exam getExamid() {
        return examid;
    }

    public void setExamid(Exam examid) {
        this.examid = examid;
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
        if (!(object instanceof Applicationexam)) {
            return false;
        }
        Applicationexam other = (Applicationexam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integradora.Applicationexam[ id=" + id + " ]";
    }
    
}
