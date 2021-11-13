import React from 'react'
import '../styles/Component.css'

const functionComponent = (props) => {
   return (
       <li>{props.nome} trará {props.tarefa}</li>
   )
}

export default functionComponent