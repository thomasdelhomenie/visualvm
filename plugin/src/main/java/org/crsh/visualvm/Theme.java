package org.crsh.visualvm;

import java.awt.*;

/**
 * @author <a href="mailto:alain.defrance@exoplatform.com">Alain Defrance</a>
 */
public enum Theme {

  DARK {
    public Color red() { return new Color(210, 82, 82); }
    public Color black() { return new Color(50, 50, 50); }
    public Color blue() { return new Color(64, 152, 255); }
    public Color cyan() { return new Color(190, 214, 255); }
    public Color green() { return new Color(127, 225, 115); }
    public Color magenta() { return new Color(245, 127, 255); }
    public Color white() { return new Color(238, 238, 236); }
    public Color yellow() { return new Color(255, 198, 109); }
    public Color bg() { return black(); }
    public Color fg() { return white(); }
    public Color input() { return new Color(40, 40, 40);}
    public Resources waiting() { return Resources.WAITING_DARK; }
  },

  LIGHT {
    public Color red() { return new Color(210, 82, 82); }
    public Color black() { return new Color(50, 50, 50); }
    public Color blue() { return new Color(64, 152, 255); }
    public Color cyan() { return new Color(190, 214, 255); }
    public Color green() { return new Color(127, 225, 115); }
    public Color magenta() { return new Color(245, 127, 255); }
    public Color white() { return new Color(238, 238, 236); }
    public Color yellow() { return new Color(255, 198, 109); }
    public Color bg() { return white(); }
    public Color fg() { return black(); }
    public Color input() { return new Color(228, 228, 226); }
    public Resources waiting() { return Resources.WAITING_LIGHT; }

  };

  public abstract Color red();
  public abstract Color black();
  public abstract Color blue();
  public abstract Color cyan();
  public abstract Color green();
  public abstract Color magenta();
  public abstract Color white();
  public abstract Color yellow();

  public abstract Color bg();
  public abstract Color fg();
  public abstract Color input();
  public abstract Resources waiting();


  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
  
}
