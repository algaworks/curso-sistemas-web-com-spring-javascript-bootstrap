insert into venda (data_criacao, valor_total, status, codigo_cliente, codigo_usuario) 
  values (
    FROM_UNIXTIME(ROUND((RAND() * (1473292800 - 1454284800) + 1454284800)))
  , round(rand() * 10000, 2)
  , 'EMITIDA'
  , round(rand() * 7) + 1
  , round(rand() * 2) + 1)
  