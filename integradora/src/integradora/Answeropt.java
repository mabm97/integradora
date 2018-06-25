/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MarcoAntonio
 */
@Entity
@Table(name = "answeropt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Answeropt.findAll", query = "SELECT a FROM Answeropt a")
    , @NamedQuery(name = "Answeropt.findById", query = "SELECT a FROM Answeropt a WHERE a.id = :id")
    , @NamedQuery(name = "Answeropt.findByStatus", query = "SELECT a FROM Answeropt a WHERE a.status = :status")
    , @NamedQuery(name = "Answeropt.findByDescription", query = "SELECT a FROM Answeropt a WHERE a.description = :description")})
public class Answeropt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "Question_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Question questionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "answerOptid", fetch = FetchType.LAZY)
    private List<Useranswer> useranswerList;

    public Answeropt() {
    }

    public Answeropt(Integer id) {
        this.id = id;
    }

    public Answeropt(Integer id, int status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Question questionid) {
        this.questionid = questionid;
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
        if (!(object instanceof Answeropt)) {
            return false;
        }
        Answeropt other = (Answeropt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integradora.Answeropt[ id=" + id + " ]";
    }
    
}
