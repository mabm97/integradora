/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.exambuild.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MARCOABM
 */
@Entity
@Table
public class Answeropt implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private int status;
    @Column
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
        return "mx.edu.utez.exambuild.entity.Answeropt[ id=" + id + " ]";
    }
    
}
