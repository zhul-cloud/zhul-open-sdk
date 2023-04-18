package com.zhul.open.sdk.client.executor;


import com.zhul.open.sdk.client.processor.ResponsePostProcessor;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface Executor {
  String execute(ExecutionContext context);

  void registerResponsePostProcessor(ResponsePostProcessor responsePostProcessor);
}
