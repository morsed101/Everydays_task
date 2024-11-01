// Generated by view binder compiler. Do not edit!
package com.morsed.everydaystask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.morsed.everydaystask.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAdd;

  @NonNull
  public final Button btnClear;

  @NonNull
  public final EditText etTask;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final RecyclerView rvTasks;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAdd,
      @NonNull Button btnClear, @NonNull EditText etTask, @NonNull ImageView ivLogo,
      @NonNull RecyclerView rvTasks) {
    this.rootView = rootView;
    this.btnAdd = btnAdd;
    this.btnClear = btnClear;
    this.etTask = etTask;
    this.ivLogo = ivLogo;
    this.rvTasks = rvTasks;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAdd;
      Button btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btnClear;
      Button btnClear = ViewBindings.findChildViewById(rootView, id);
      if (btnClear == null) {
        break missingId;
      }

      id = R.id.etTask;
      EditText etTask = ViewBindings.findChildViewById(rootView, id);
      if (etTask == null) {
        break missingId;
      }

      id = R.id.ivLogo;
      ImageView ivLogo = ViewBindings.findChildViewById(rootView, id);
      if (ivLogo == null) {
        break missingId;
      }

      id = R.id.rvTasks;
      RecyclerView rvTasks = ViewBindings.findChildViewById(rootView, id);
      if (rvTasks == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnAdd, btnClear, etTask, ivLogo,
          rvTasks);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
