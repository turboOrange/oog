/* This file was generated by SableCC (http://www.sablecc.org/). */

package event.syntax.node;

import event.syntax.analysis.*;

@SuppressWarnings("nls")
public final class TLBrace extends Token
{
    public TLBrace()
    {
        super.setText("{");
    }

    public TLBrace(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLBrace(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLBrace(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLBrace text.");
    }
}
