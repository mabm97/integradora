/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.exambuild.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MARCOABM
 */
@Entity
@Table
public class Useranswer implements Serializable {

    @Id
    @GeneratedValue
    @Column
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
        return "mx.edu.utez.exambuild.entity.Useranswer[ id=" + id + " ]";
    }

}
