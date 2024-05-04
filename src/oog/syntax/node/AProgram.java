/* This file was generated by SableCC (http://www.sablecc.org/). */

package oog.syntax.node;

import java.util.*;
import oog.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private final LinkedList<PVariabledef> _variabledefs_ = new LinkedList<PVariabledef>();
    private final LinkedList<PEventdef> _eventdefs_ = new LinkedList<PEventdef>();

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") List<?> _variabledefs_,
        @SuppressWarnings("hiding") List<?> _eventdefs_)
    {
        // Constructor
        setVariabledefs(_variabledefs_);

        setEventdefs(_eventdefs_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneList(this._variabledefs_),
            cloneList(this._eventdefs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public LinkedList<PVariabledef> getVariabledefs()
    {
        return this._variabledefs_;
    }

    public void setVariabledefs(List<?> list)
    {
        for(PVariabledef e : this._variabledefs_)
        {
            e.parent(null);
        }
        this._variabledefs_.clear();

        for(Object obj_e : list)
        {
            PVariabledef e = (PVariabledef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._variabledefs_.add(e);
        }
    }

    public LinkedList<PEventdef> getEventdefs()
    {
        return this._eventdefs_;
    }

    public void setEventdefs(List<?> list)
    {
        for(PEventdef e : this._eventdefs_)
        {
            e.parent(null);
        }
        this._eventdefs_.clear();

        for(Object obj_e : list)
        {
            PEventdef e = (PEventdef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._eventdefs_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variabledefs_)
            + toString(this._eventdefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variabledefs_.remove(child))
        {
            return;
        }

        if(this._eventdefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PVariabledef> i = this._variabledefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVariabledef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PEventdef> i = this._eventdefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PEventdef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}