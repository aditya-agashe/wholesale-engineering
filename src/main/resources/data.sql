
insert into currency(currency_id, currency_name) values(1, 'SGD');
insert into currency(currency_id, currency_name) values(2, 'AUD');

insert into account_type(account_type_id, account_type_name) values(1, 'Savings');
insert into account_type(account_type_id, account_type_name) values(2, 'Current');


insert into account(account_number, account_name, account_type_id, currency_id)  values(860657071,'SGSavings726', 1, 1);
insert into account(account_number, account_name, account_type_id, currency_id)  values(334598182,'AUSavings925', 1, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(837582508,'SGSavings874', 1, 1);
insert into account(account_number, account_name, account_type_id, currency_id)  values(273463715,'AUSavings989', 1, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(431023942,'AUCurrent932', 2, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(336530613,'SGCurrent126', 2, 1);
insert into account(account_number, account_name, account_type_id, currency_id)  values(699511908,'AUCurrent282', 2, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(440788731,'AUCurrent872', 2, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(864044812,'SGCurrent693', 2, 1);
insert into account(account_number, account_name, account_type_id, currency_id)  values(949319705,'AUSavings419', 1, 2);
insert into account(account_number, account_name, account_type_id, currency_id)  values(759668691,'SGCurrent190', 2, 1);
insert into account(account_number, account_name, account_type_id, currency_id)  values(504808356,'AUSavings868', 1, 2);


insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-01', 3823.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-02', 2.1, 'random text');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-03', 5362.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-09', 6403.66, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-11', 401.78, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-11', 767.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-12', -442.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '860657071'), '2019-09-14', -85.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-14', -56.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-15', -104.26, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '860657071'), '2019-09-21', 25.46, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '860657071'), '2019-09-25', 0.12);
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '860657071'), '2019-09-15', 8559.12);

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '334598182'), '2019-09-04', 3813.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '334598182'), '2019-09-10', 67.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '334598182'), '2019-09-12', -42.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '334598182'), '2019-09-14', -15.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '334598182'), '2019-09-14', -506.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '334598182'), '2019-09-15', -104.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '837582508'), '2019-09-02', 1811.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '837582508'), '2019-09-09', 607.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '837582508'), '2019-09-13', -12.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '837582508'), '2019-09-14', -95.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '837582508'), '2019-09-19', -96.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '837582508'), '2019-09-25', -184.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '273463715'), '2019-09-02', 2811.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '273463715'), '2019-09-09', 617.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '273463715'), '2019-09-13', -52.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '273463715'), '2019-09-14', -905.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '273463715'), '2019-09-19', -6.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '273463715'), '2019-09-25', -14.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '431023942'), '2019-09-02', 11.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '431023942'), '2019-09-09', 788.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '431023942'), '2019-09-13', -52.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '431023942'), '2019-09-14', -7.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '431023942'), '2019-09-19', 899.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '431023942'), '2019-09-25', 567.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '336530613'), '2019-09-08', 101.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '336530613'), '2019-09-09', 718.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '336530613'), '2019-09-14', -92.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '336530613'), '2019-09-19', -87.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '336530613'), '2019-09-21', 189.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '336530613'), '2019-09-25', 07.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '699511908'), '2019-09-08', 561.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '699511908'), '2019-09-09', 118.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '699511908'), '2019-09-14', -12.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '699511908'), '2019-09-19', -57.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '699511908'), '2019-09-21', 219.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '699511908'), '2019-09-25', 56.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '440788731'), '2019-09-08', 521.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '440788731'), '2019-09-09', 818.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '440788731'), '2019-09-14', -112.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '440788731'), '2019-09-19', -507.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '440788731'), '2019-09-21', 2219.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '440788731'), '2019-09-25', 5556.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '864044812'), '2019-09-08', 5021.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '864044812'), '2019-09-09', 81.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '864044812'), '2019-09-14', -192.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '864044812'), '2019-09-19', -807.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '864044812'), '2019-09-21', 29.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '864044812'), '2019-09-25', 56.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '949319705'), '2019-09-02', 521.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '949319705'), '2019-09-07', 801.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '949319705'), '2019-09-11', -12.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '949319705'), '2019-09-16', -87.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '949319705'), '2019-09-20', 2009.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '949319705'), '2019-09-28', -856.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '759668691'), '2019-09-02', 51.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '759668691'), '2019-09-07', 81.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '759668691'), '2019-09-11', -12.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '759668691'), '2019-09-16', -87.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '759668691'), '2019-09-20', 29.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '759668691'), '2019-09-28', 886.26, '');

insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '504808356'), '2019-09-02', 501.89, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '504808356'), '2019-09-07', 801.99, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '504808356'), '2019-09-11', -82.38, '');
insert into account_transaction(account_id, transaction_date, transaction_amount)   values ( (select account_id from account where account_number = '504808356'), '2019-09-16', -97.85);
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '504808356'), '2019-09-20', 209.56, '');
insert into account_transaction(account_id, transaction_date, transaction_amount, transaction_narrative)   values ( (select account_id from account where account_number = '504808356'), '2019-09-28', 886.26, '');
