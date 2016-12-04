// Generated code from Butter Knife. Do not modify!
package id.co.dycode.ghopunz.calculator;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131427414;

  private View view2131427415;

  private View view2131427416;

  private View view2131427417;

  private View view2131427418;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.input1 = Utils.findRequiredViewAsType(source, R.id.input1, "field 'input1'", EditText.class);
    target.input2 = Utils.findRequiredViewAsType(source, R.id.input2, "field 'input2'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_add, "field 'btnAdd' and method 'onClick'");
    target.btnAdd = Utils.castView(view, R.id.btn_add, "field 'btnAdd'", Button.class);
    view2131427414 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_minus, "field 'btnMinus' and method 'onClick'");
    target.btnMinus = Utils.castView(view, R.id.btn_minus, "field 'btnMinus'", Button.class);
    view2131427415 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_devided, "field 'btnDevided' and method 'onClick'");
    target.btnDevided = Utils.castView(view, R.id.btn_devided, "field 'btnDevided'", Button.class);
    view2131427416 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_multiple, "field 'btnMultiple' and method 'onClick'");
    target.btnMultiple = Utils.castView(view, R.id.btn_multiple, "field 'btnMultiple'", Button.class);
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.hasil = Utils.findRequiredViewAsType(source, R.id.hasil, "field 'hasil'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_modulus, "field 'btnModulus' and method 'onClick'");
    target.btnModulus = Utils.castView(view, R.id.btn_modulus, "field 'btnModulus'", Button.class);
    view2131427418 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.input1 = null;
    target.input2 = null;
    target.btnAdd = null;
    target.btnMinus = null;
    target.btnDevided = null;
    target.btnMultiple = null;
    target.hasil = null;
    target.btnModulus = null;

    view2131427414.setOnClickListener(null);
    view2131427414 = null;
    view2131427415.setOnClickListener(null);
    view2131427415 = null;
    view2131427416.setOnClickListener(null);
    view2131427416 = null;
    view2131427417.setOnClickListener(null);
    view2131427417 = null;
    view2131427418.setOnClickListener(null);
    view2131427418 = null;

    this.target = null;
  }
}
