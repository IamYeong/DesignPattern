package com.todaylunch.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_singleton, btn_strategy, btn_factory, btn_observer, btn_abstractfactory
            , btn_builder, btn_prototype, btn_chain, btn_command, btn_iterator, btn_mediator, btn_memento
            , btn_state, btn_visitor, btn_templete, btn_adapter, btn_bridge, btn_composite, btn_decorator, btn_facade
            , btn_proxy, btn_flyweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_singleton = findViewById(R.id.btn_singleton_main);
        btn_strategy = findViewById(R.id.btn_strategy);
        btn_factory = findViewById(R.id.btn_factory_main);
        btn_observer = findViewById(R.id.btn_observer_main);
        btn_abstractfactory = findViewById(R.id.btn_abstractfactory_main);
        btn_builder = findViewById(R.id.btn_builder_main);
        btn_prototype = findViewById(R.id.btn_prototype_main);
        btn_chain = findViewById(R.id.btn_chain_main);
        btn_command = findViewById(R.id.btn_command_main);
        btn_iterator = findViewById(R.id.btn_iterator_main);
        btn_mediator = findViewById(R.id.btn_mediator_main);
        btn_memento = findViewById(R.id.btn_memento_main);
        btn_state = findViewById(R.id.btn_state_main);
        btn_visitor = findViewById(R.id.btn_visitor_main);
        btn_templete = findViewById(R.id.btn_templete_main);
        btn_adapter = findViewById(R.id.btn_adapter_main);
        btn_bridge = findViewById(R.id.btn_bridge_main);
        btn_composite = findViewById(R.id.btn_composite_main);
        btn_decorator = findViewById(R.id.btn_decorator_main);
        btn_facade = findViewById(R.id.btn_facade_main);
        btn_proxy = findViewById(R.id.btn_proxy_main);
        btn_flyweight = findViewById(R.id.btn_flyweight_main);


        btn_singleton.setOnClickListener(this);
        btn_strategy.setOnClickListener(this);
        btn_factory.setOnClickListener(this);
        btn_observer.setOnClickListener(this);
        btn_abstractfactory.setOnClickListener(this);
        btn_builder.setOnClickListener(this);
        btn_prototype.setOnClickListener(this);
        btn_chain.setOnClickListener(this);
        btn_command.setOnClickListener(this);
        btn_iterator.setOnClickListener(this);
        btn_mediator.setOnClickListener(this);
        btn_memento.setOnClickListener(this);
        btn_state.setOnClickListener(this);
        btn_visitor.setOnClickListener(this);
        btn_templete.setOnClickListener(this);
        btn_adapter.setOnClickListener(this);
        btn_bridge.setOnClickListener(this);
        btn_composite.setOnClickListener(this);
        btn_decorator.setOnClickListener(this);
        btn_facade.setOnClickListener(this);
        btn_proxy.setOnClickListener(this);
        btn_flyweight.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_singleton_main :
                Intent intent = new Intent(MainActivity.this, Singleton.class);
                startActivity(intent);
                break;

            case R.id.btn_strategy :
                Intent intent2 = new Intent(MainActivity.this, StrategyPattern.class);
                startActivity(intent2);
                break;

            case R.id.btn_factory_main :
                Intent intent3 = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn_observer_main :
                Intent intent4 = new Intent(MainActivity.this, ObserverActivity.class);
                startActivity(intent4);
                break;

            case R.id.btn_abstractfactory_main :
                Intent intent5 = new Intent(MainActivity.this, AbstractFactoryActivity.class);
                startActivity(intent5);
                break;

            case R.id.btn_builder_main :
                Intent intent6 = new Intent(MainActivity.this, BuilderActivity.class);
                startActivity(intent6);
                break;

            case R.id.btn_prototype_main :
                Intent intent7 = new Intent(MainActivity.this, PrototypeActivity.class);
                startActivity(intent7);
                break;

            case R.id.btn_chain_main :
                Intent intent8 = new Intent(MainActivity.this, ChainOfResponsibilityActivity.class);
                startActivity(intent8);
                break;

            case R.id.btn_command_main :
                Intent intent9 = new Intent(MainActivity.this, CommandActivity.class);
                startActivity(intent9);
                break;

            case R.id.btn_iterator_main :
                Intent intent10 = new Intent(MainActivity.this, IteratorActivity.class);
                startActivity(intent10);
                break;

            case R.id.btn_mediator_main :
                Intent intent11 = new Intent(MainActivity.this, MediatorActivity.class);
                startActivity(intent11);
                break;

            case R.id.btn_memento_main :
                Intent intent12 = new Intent(MainActivity.this, MementoActivity.class);
                startActivity(intent12);
                break;

            case R.id.btn_state_main :
                Intent intent13 = new Intent(MainActivity.this, StateActivity.class);
                startActivity(intent13);
                break;

            case R.id.btn_visitor_main :
                Intent intent14 = new Intent(MainActivity.this, VisitorActivity.class);
                startActivity(intent14);
                break;

            case R.id.btn_templete_main :
                Intent intent15 = new Intent(MainActivity.this, TempleteMethodActivity.class);
                startActivity(intent15);
                break;

            case R.id.btn_adapter_main :
                Intent intent16 = new Intent(MainActivity.this, AdapterActivity.class);
                startActivity(intent16);
                break;
            case R.id.btn_bridge_main :
                Intent intent17 = new Intent(MainActivity.this, BridgeActivity.class);
                startActivity(intent17);
                break;

            case R.id.btn_composite_main :
                Intent intent18 = new Intent(MainActivity.this, CompositeActivity.class);
                startActivity(intent18);
                break;

            case R.id.btn_decorator_main :
                Intent intent19 = new Intent(MainActivity.this, DecoratorActivity.class);
                startActivity(intent19);
                break;

            case R.id.btn_facade_main :
                Intent intent20 = new Intent(MainActivity.this, FacadeActivity.class);
                startActivity(intent20);
                break;

            case R.id.btn_proxy_main :
                Intent intent21 = new Intent(MainActivity.this, ProxyActivity.class);
                startActivity(intent21);
                break;

            case R.id.btn_flyweight_main :
                Intent intent22 = new Intent(MainActivity.this, FlyweightActivity.class);
                startActivity(intent22);
                break;


        }

    }
}
