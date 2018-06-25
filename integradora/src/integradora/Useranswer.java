/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MarcoAntonio
 */
@Entity
@Table(name = "useranswer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Useranswer.findAll", query = "SELECT u FROM Useranswer u")
    , @NamedQuery(name = "Useranswer.findById", query = "SELECT u FROM Useranswer u WHERE u.id = :id")})
public class Useranswer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "AnswerOpt_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Answeropt answerOptid;
    @JoinColumn(name = "historyExam_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Historyexam historyExamid;

    public Useranswer() {
    }

    public Useranswer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Answeropt getAnswerOptid() {
        return answerOptid;
    }

    public void setAnswerOptid(Answeropt answerOptid) {
        this.answerOptid = answerOptid;
    }

    public Historyexam getHistoryExamid() {
        return historyExamid;
    }

    public void setHistoryExamid(Historyexam historyExamid) {
        this.historyExamid = historyExamid;
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
        if (!(object instanceof Useranswer)) {
            return false;
        }
        Useranswer other = (Useranswer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integradora.Useranswer[ id=" + id + " ]";
    }
    
}
